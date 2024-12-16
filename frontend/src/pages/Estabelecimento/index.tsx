import Galeria from "./galeria";
import Happening from "./happening";
import Menu from "./menu";
import Perfil from "./perfil";

import "./styles.css";


const Estabelecimento = () => {
  return (
    <>
      <div className="main-content">
        <Perfil />
        <br />
        <Happening />
        <br />
        <Galeria />
        <br />
        <Menu />
      </div>
    </>
  );
};

export default Estabelecimento;
