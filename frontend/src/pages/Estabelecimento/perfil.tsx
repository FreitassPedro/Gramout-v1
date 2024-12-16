import React from "react";

import "./styles.css";

const Perfil: React.FC = () => {
  return (
    <section id="perfil-estabelecimento" className="perfil-estabelecimento">
      <h1>Perfil do Estabelecimento</h1>
      <div className="perfil-content">
        <div className="brand-logo">
          <img src="/src/assets/photosExample/logo-icon.jpg" alt="icon" />
        </div>

        <div className="name">
          <h1>Bistro Bar</h1>
        </div>
        <div className="profile-tabs ">
          <ul className="tab-list">
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
      </div>
    </section>
  );
};

export default Perfil;
