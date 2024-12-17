import "./styles.css";

const Filtros: React.FC = () => {
  return (
    /* Seção de teste, apenas visualizazação versão desenvolvimento*/
    <section id="filtros" className="filtros">
      <div>
        <h1>Filtros</h1>
        <span>
          Seção de teste, apenas visualizazação versão desenvolvimento
        </span>

        <div className="tags-container">
          <div className="tag-card">
            <span>Preco Acessível</span>
          </div>
          <div className="tag-card">
            <span>Comida Caseira</span>
          </div>
          <div className="tag-card">
            <span>Tag 3</span>
          </div>
          <div className="tag-card">
            <span>Tag 4</span>
          </div>
        </div>
      </div>
    </section>
  );
  /* Filtros */
};

export default Filtros;
