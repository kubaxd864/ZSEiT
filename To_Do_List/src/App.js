import React, { Suspense, useState } from 'react'
import './App.css';

const App = () => {
  const [items, setItem] = useState([]);
  const [newItem, setNewItem] = useState("");
  const [hideCompleted, setHideCompleted] = useState(false);

  const addToList = (item) => {
    document.getElementById('input');
    setNewItem("");
    let i = items.length+1;
    const obj = { id: i, name: item, done: false };
    return items.push(obj);
  }

  const handleCheckbox = (status, id) => {
    items[id - 1].done = !status;
    document.getElementById(`item-${id}`).style.textDecoration = status === false ? 'line-through' : 'none';
  }

  const handleFilter = () => {
    setHideCompleted(!hideCompleted);
  }

  return (
    <div className="App">
      <h1>Welcome in MY TO DO List</h1>
      <input id='input' value={newItem} type={'text'} onChange={(e) => { return setNewItem(e.target.value) }} />
      <button onClick={() => { return addToList(newItem); }}>Add</button>
      <table>
        <tr>
          <td><input type={'checkbox'} onChange={() => { return handleFilter(); }} /> hide completed</td>
        </tr>
        <Suspense>
          {items.length > 0 ? items.map(function (item, i) {
            return (<tr key={i}><td style={hideCompleted && item.done === true ? { display: 'none' } : {border: 'none'}}><span id={`item-${item.id}`} style={item.done ? { textDecoration: 'line-through' } : { textDecoration: 'none' }}><input onChange={(e) => { return handleCheckbox(item.done, item.id) }} type={'checkbox'} defaultChecked={item.done ? true : false} />{item.name}</span></td></tr>);
          }) : <tr>Nie masz nic do zrobienia...</tr>}
        </Suspense>
      </table>
    </div>
  );
}

export default App;
