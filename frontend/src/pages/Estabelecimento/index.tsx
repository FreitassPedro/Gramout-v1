import Galeria from "./galeria";
import Happening from "./happening";
import Menu from "./menu";
import Perfil from "./perfil";
import Filtros from "./filtros";
import Avaliacoes from "./avaliacoes";

import "./styles.css";


const Estabelecimento = () => {
  return (
    <>
      <div className="main-estabelecimento-page">
        <Perfil />
        <br />
        <Happening />
        <br />
        <Galeria />
        <br />
        <Menu />
        <br />
        <Avaliacoes />
        <br />
        <Filtros />
      </div>
    </>
  );
};

export default Estabelecimento;
