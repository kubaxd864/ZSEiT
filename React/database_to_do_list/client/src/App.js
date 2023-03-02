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
  useToast,
} from '@chakra-ui/react'
import { DeleteIcon, RepeatIcon, AddIcon, MinusIcon } from '@chakra-ui/icons'

function App() {
  const toast = useToast();
  const [todo, setTodo] = useState([]);
  useEffect(() => {
    axios.get("http://localhost:5000/").then((response) => {
      setTodo(response.data.message);
    })
  }, [])

  const Delete = () => {
    console.log('Usunięto');
  }

  const Update = () => {
    console.log('Zaktualizowano');
  }

  const Add = () => {
    console.log('Dodano');
  }

  return (
    <div className="App">
      <header className="App-header">
        <div className='container'>
          <h1>Lista rzeczy do zrobienia:</h1>
          <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30' onClick={() =>
                toast({
                  title: 'Account created.',
                  description: "We've created your account for you.",
                  status: 'success',
                  duration: 9000,
                  isClosable: true,
                })
              }>
              <AddIcon fontSize='12px' marginRight='3'/>
              <p>Add New Element</p>
          </Button>
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
                        <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30' onClick={Delete}>
                          <DeleteIcon fontSize='12px' marginRight='3'/>
                          <p>Delete</p>
                        </Button>
                        <Button bg='lightgray' borderWidth='1px' borderColor='black' height='30'>
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