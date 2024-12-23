import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import HomePage from './pages/HomePage';
import Estabelecimento from './pages/Estabelecimento';
import Estabelecimentos from './pages/Estabelecimentos';

function App() {
 
return (
  <BrowserRouter>
    <Routes>
      <Route path='/*' element={<HomePage />} />
      <Route path='/estabelecimentos' element={<Estabelecimentos />} />
      <Route path="/:estabelecimento" element={<Estabelecimento />} />
    </Routes>
  </BrowserRouter>
  );
};

export default App
