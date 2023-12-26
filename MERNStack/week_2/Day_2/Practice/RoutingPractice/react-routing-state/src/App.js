
import './App.css';
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import Home from './components/Home';

import Color from './components/Color';

function App() {
  
  return (
    <div className="App">
      
      <Routes>
      <Route path="/home" element={<Home/>} />
      
      <Route path="/:word/:color1/:color2" element={<Color/>} />

      </Routes>
      
    </div>
  );
}

export default App;
