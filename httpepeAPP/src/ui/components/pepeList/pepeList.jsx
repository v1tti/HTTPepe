import "./index.css";

export function PepeList({ pepes }) {
  if (!pepes) {
    return null;
  }

  return (
    <div className="pepes-container">
      {pepes.map(({ id, name, httpCode, url }) => {
        return (
          <div className="pepe-card" key={id}>
            <img src={url ? url : ""} alt="Pepe para o código"></img>
            <div className="pepe-card-text-holder">
              <h1>{httpCode}</h1>
              <p>{name}</p>
            </div>
          </div>
        );
      })}
    </div>
  );
}
