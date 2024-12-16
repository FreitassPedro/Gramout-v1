import Galeria from "./galeria";
import Menu from "./menu";
import Perfil from "./perfil";

import "./styles.css";


const Estabelecimento = () => {
  return (
    <>
      <div className="main-content">
        <Perfil />
        <br />
        <Galeria />
        <br />
        <Menu />
      </div>
    </>
  );
};

export default Estabelecimento;
