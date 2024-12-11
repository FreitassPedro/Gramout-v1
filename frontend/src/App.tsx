import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import HomePage from './pages/HomePage';
import Estabelecimento from './pages/Estabelecimento';

function App() {
 
return (
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<HomePage />} />
      <Route path="/:estabelecimento" element={<Estabelecimento />} />

    </Routes>
  </BrowserRouter>
  );
};

export default App
