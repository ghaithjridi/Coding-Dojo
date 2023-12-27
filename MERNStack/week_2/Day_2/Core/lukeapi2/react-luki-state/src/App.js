import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import './App.css';
import People from "./components/People";
import Forms from "./components/Forms";
import Error from "./components/Error";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<Forms/>}/>

        <Route path='/:pep/:id' element={<><People/> <Forms/></>}/>
        
        <Route path="*" element={<Error />} />


      </Routes>
    </div>
  );
}

export default App;
