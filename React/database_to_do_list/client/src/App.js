import React, { useState, useEffect} from 'react';
import './App.css';
import axios from 'axios';
import {
  Accordion,
  AccordionItem,
  AccordionButton,
  AccordionPanel,
  Box,
  Button,
  Stack,
} from '@chakra-ui/react'
import { DeleteIcon, RepeatIcon, AddIcon, MinusIcon } from '@chakra-ui/icons'

function App() {
  const [todo, setTodo] = useState([]);
  const [showDiv, setShowDiv] = useState(false);
  useEffect(() => {
    axios.get("http://localhost:5000/").then((response) => {
      setTodo(response.data.message);
    })
  }, [])

  return (
    <div className="App">
      <header className="App-header">
        <div className='container'>
          <h1>Lista rzeczy do zrobienia:</h1>
          <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30' onClick={() => {
            if (showDiv === true) {
              setShowDiv(false);
            } else if (showDiv === false){
              setShowDiv(true);
            }
            
          }}>
              <AddIcon fontSize='12px' marginRight='3'/>
              <p>Add New Element</p>
          </Button>
          {showDiv && (
            <div className='Add'>
              <input type='text' placeholder='Title' />
              <input type='text' placeholder='Description' />
            </div>
          )}
          <p className='to_do'>
            {todo[0] && todo.map((item, i) => {
              return (
            <Accordion >
              <AccordionItem>
                {({ isExpanded }) => (
                  <>
                    <h2>
                      <Stack spacing={4} direction='row' align='center'>
                      <AccordionButton bg='lightgray' borderWidth='1px' borderColor='black' height='30'>
                          <Box as="span" flex='2' textAlign='center' width={200}>
                            {todo[i].title}
                          </Box>
                          {isExpanded ? (
                            <MinusIcon fontSize='12px' />
                          ) : (
                            <AddIcon fontSize='12px' />
                          )}
                        </AccordionButton>
                        <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30' onClick={() => {
                          const id = todo[i].id;
                          axios.delete(`http://localhost:5000/delete/${id}`)
                          .then(response => {
                            setTodo(response.data.message);
                          })
                          .catch(error => {
                            console.error(error);
                          });
                        }}>
                          <DeleteIcon fontSize='12px' marginRight='3'/>
                          <p>Delete</p>
                        </Button>
                        <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30'onClick={() => 
                          console.log("Zaktualizowane Element " + i)
                        }>
                          <RepeatIcon fontSize='12px' marginRight='3'/>
                          <p>Update</p>
                        </Button>
                      </Stack>
                    </h2>
                    <AccordionPanel pb={4}>
                      {todo[i].description}
                    </AccordionPanel>
                  </>
                )}
              </AccordionItem>
            </Accordion>
              );
            })}
          </p>
        </div>
      </header>
    </div>
  );
}

export default App;