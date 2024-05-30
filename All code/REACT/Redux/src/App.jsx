 
import './App.css';
// import Todo from '../../react-object-state/src/todo';
import Todo from './Todo.jsx';
import {Provider} from "react-redux";
import {store} from './store.jsx';

function App() {
 
  return (
    <>
    <Provider store={store}>
      {/* ab jitne bhi component provider ke andr honge un sbako store pass ho jayega */}
      <Todo/>
      </Provider>
    
     
     </>
  )
}

export default App
