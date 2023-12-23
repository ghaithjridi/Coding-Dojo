
import { useState } from 'react';
import './App.css';
import Tabs from './components/Tabs';
import TabsDisplay from './components/TabsDisplay';


function App() {
  const [data,setData]=useState("");

  const newContent=(content)=>{
    setData(content);
  }
  return (
    <div className="App">

      <Tabs/>
      <TabsDisplay data={newContent}/>
    
      
    </div>
  );
}

export default App;
