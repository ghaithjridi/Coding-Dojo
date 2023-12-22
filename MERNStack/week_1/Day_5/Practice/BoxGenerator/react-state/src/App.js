import './App.css';
import BoxDisplay from './components/BoxDisplay';
import { useState } from 'react';

function App() {
  const[box,setBox]= useState("");
  const[bar,setBar]= useState([]);
  console.log(box)
  const handleSubmit =(e)=> {
      e.preventDefault();
      setBar([...bar,box])
      setBox('')
  };
  return (
  <form className='form' onSubmit={handleSubmit}>
      <h1>Color</h1>
      <input type="color" onChange={(e)=>{setBox(e.target.value)}}/>
    <button>Add</button>
    <BoxDisplay boxs={bar} />
  </form>
)
}

export default App;
