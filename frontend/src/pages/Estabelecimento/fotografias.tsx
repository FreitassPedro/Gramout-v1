import React from "react";
import "./styles.css";

const Fotografias: React.FC = () => {
  return (
    <div>
      <h2>Fotografias</h2>

      <section id="galeria" className="galeria">
        <div className="galeria-container">
          <div className="container-fluid">
            <div className="grid">
              <div className="item">
                <img
                  src="src/assets/photosExample/img-1.jpg"
                  className="img-fluid"
                  alt="Imagem 1"
                />
              </div>
              <div className="item">
                <img
                  src="src/assets/photosExample/img-2.jpg"
                  className="img-fluid "
                  alt="Imagem 2"
                />
              </div>
              <div className="item">
                <img
                  src="src/assets/photosExample/img-3.jpg"
                  className="img-fluid "
                  alt="Imagem 3"
                />
              </div>
              <div className="item">
                <img
                  src="src/assets/photosExample/img-4.jpg"
                  className="img-fluid "
                  alt="Imagem 4"
                />
              </div>
              <div className="item">
                <img
                  src="src/assets/photosExample/img-1.jpg"
                  className="img-fluid "
                  alt="Imagem 4"
                />
              </div>
              <div className="item">
                <img
                  src="src/assets/photosExample/img-4.jpg"
                  className="img-fluid "
                  alt="Imagem 4"
                />
              </div>
              <div className="item">
                <img
                  src="src/assets/photosExample/img-4.jpg"
                  className="img-fluid"
                  alt="Imagem 4"
                />
              </div>
          

            </div>
          </div>
          <div className="img-big">
            <img
              src="src/assets/photosExample/img-2.jpg"
              className="img-fluid rounded "
              alt="Imagem 4"
            />
          </div>
        </div>
      </section>
    </div>
  );
};

export default Fotografias;
