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
import { DeleteIcon, RepeatIcon, AddIcon, MinusIcon, ArrowUpIcon } from '@chakra-ui/icons'

function App() {
  const [todo, setTodo] = useState([]);
  const [showAddDiv, setShowAddDiv] = useState(false);
  const [showUpdateDiv, setShowUpdateDiv] = useState(false);
  const [updatedid, setUpdatedId] = useState();
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
            if (showAddDiv === false){
              setShowAddDiv(true);
              setShowUpdateDiv(false);
            } else if (showAddDiv === true) {
              setShowAddDiv(false);
            }}}>
              <AddIcon fontSize='12px' marginRight='3'/>
              <p>Add New Element</p>
          </Button>
          {showAddDiv && (
            <div className='Add'>
              <input type='text' name='Title' placeholder='Title' />
              <input type='text' name='Description' placeholder='Description' />
              <Button bg='lightgray' borderRadius='16px' borderWidth='1px' borderColor='black' height='30' marginTop='10px'  onClick={() => {
                const title = document.getElementsByName('Title')[0].value;
                const description = document.getElementsByName('Description')[0].value;
                axios.post('http://localhost:5000/add', {
                  title: title,
                  description: description
                }).then(response => {
                  setTodo(response.data.message);
                })
              }}>
                <ArrowUpIcon fontSize='12px' marginRight='3'/>
                <p>Add Element</p>
              </Button>
              <p className='Message'></p>
            </div>
          )}
          {showUpdateDiv && (
            <div className='Update'>
              <input type='text' name='Title' placeholder='Title' />
              <input type='text' name='Description' placeholder='Description' />
              <Button bg='lightgray' borderRadius='16px' borderWidth='1px' borderColor='black' height='30' marginTop='10px'  onClick={() => {
                const id = updatedid;
                const title = document.getElementsByName('Title')[0].value;
                const description = document.getElementsByName('Description')[0].value;
                axios.post('http://localhost:5000/update', {
                  id: id,
                  title: title,
                  description: description
                }).then(response => {
                  setTodo(response.data.message);
                })
              }}>
                <ArrowUpIcon fontSize='12px' marginRight='3'/>
                <p>Update Element</p>
              </Button>
              <p className='Message'></p>
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
                          axios.delete(`http://localhost:5000/delete/${id}`).then(response => {
                            setTodo(response.data.message);
                          }).catch(error => {
                            console.error(error);
                          });
                        }}>
                          <DeleteIcon fontSize='12px' marginRight='3'/>
                          <p>Delete</p>
                        </Button>
                        <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30' onClick={() => {
                            if (showUpdateDiv === false){
                              setShowUpdateDiv(true);
                              setShowAddDiv(false);
                              setUpdatedId(todo[i].id);
                            } else if (showUpdateDiv === true) {
                              setShowUpdateDiv(false);
                            }}}>
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