import React from "react";

import "./styles.css";

const Perfil: React.FC = () => {
  return (
    <section id="perfil-estabelecimento" className="perfil-estabelecimento">
      <h1>Perfil do Estabelecimento</h1>
      <div className="perfil-content">
        <div className="profile-header">
          <div className="profile-basics">
            <div className="brand-logo">
              <img src="/src/assets/photosExample/logo-icon.jpg" alt="icon" />
            </div>
            <div className="brand-name">
              <h1>Bistro Bar</h1>
            </div>
          </div>
          <div className="profile-details">
            <div className="profile-rating">
              <span>4 ★★★★☆</span>
            </div>
            <div className="profile-address">
              <span>Endereço: Rua dos Bobos, 0</span>
            </div>
            <div className="profile-phone">
              <span>Telefone: (11) 9999-9999</span>
            </div>
            <div className="profile-site">
              <span>Site (Clique aqui)</span>
            </div>
            <div className="profile-hours">
              <span>Aberto agora: Fecha às 23:59 </span>
            </div>
          </div>
        </div>
        <div className="profile-tabs ">
          <ul className="tab-list">
            <li>
              <a href="#">Sobre</a>
            </li>
            <li>
              <a href="#happening">Eventos</a>
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
