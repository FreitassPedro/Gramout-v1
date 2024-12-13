import Galeria from "./galeria";
import Menu from "./menu";
import Perfil from "./perfil";

import "./styles.css";

const Estabelecimento = () => {
  return (
    <>
      <div className="main-content">
        <header>
          <nav>
            <ul>
              <li>
                <a href="/">Home</a>
              </li>
            </ul>
          </nav>
        </header>
        <Perfil />
        <Galeria />
        <Menu />
      </div>
    </>
  );
};

export default Estabelecimento;
