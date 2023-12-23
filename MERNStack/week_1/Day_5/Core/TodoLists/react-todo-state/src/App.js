import React, { useState} from 'react';
import './App.css';
import Form from './components/Form';
import Tasks from './components/Tasks';

function App() {
  const [tasks, setTasks] = useState([]);
  return (
    <>
      <Form tasks={tasks} setTasks={setTasks} />
      <ul>
        {tasks.map((task, idx) => {
          return (<li key={idx}>
            <Tasks value={idx} task={task} tasks={tasks} setTasks={setTasks} /> 
            </li>);
        })}
      </ul>
    </>
  );
};

export default App;