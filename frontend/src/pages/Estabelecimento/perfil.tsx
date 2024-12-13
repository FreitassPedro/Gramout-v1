import React from "react";

import "./styles.css";

const Perfil: React.FC = () => {
  return (
    <section id="perfil-estabelecimento" className="perfil-estabelecimento">
      <div>
        <h1>Perfil do Estabelecimento</h1>
        <div className="logo-icon">
          <img src="/src/assets/photosExample/logo-icon.jpg" alt="icon" />
        </div>
      </div>
    </section>
  );
};

export default Perfil;
