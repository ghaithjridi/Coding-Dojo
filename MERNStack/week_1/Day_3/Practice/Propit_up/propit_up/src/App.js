
import './App.css';
import PersonCard from './components/personcard';


function App() {
  return (
    <div className="App">
<PersonCard firstName={ "Doe" } lastName={ "Joe" } age={45}  color={"black"} />
<PersonCard firstName={ "Smith" } lastName={ "John" } age={88} color={"brown"} />
<PersonCard firstName={ "Fillmore" } lastName={ "Millard" } age={50} color={"brown"} />
<PersonCard firstName={ "smith" } lastName={ "Maria" } age={62} color={"brown"} />
    </div>
  );
}

export default App;
