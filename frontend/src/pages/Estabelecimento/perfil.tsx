import React from "react";

import "./styles.css";

const Perfil: React.FC = () => {
  return (
    <section id="perfil-estabelecimento" className="perfil-estabelecimento">
      <h1>Perfil do Estabelecimento</h1>
      <div className="perfil-content">
        <div className="logo-icon">
          <img src="/src/assets/photosExample/logo-icon.jpg" alt="icon" />
        </div>
        <div className="tabs">
          <ul className="tabs-list">
            <li>
              <a href="#">Sobre</a>
            </li>
            <li>
              <a href="#menu">Posts</a>
            </li>
            <li>
              <a href="#galeria">Galeria</a>
            </li>
            <li>
              <a href="">Rating</a>
            </li>
            <li>
              <a href="#">Contato</a>
            </li>
          </ul>
        </div>
        <div>
          <button>Search</button>
        </div>
      </div>
    </section>
  );
};

export default Perfil;
