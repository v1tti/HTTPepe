import { useEffect, useState } from "react";
import { getPepeList } from "../../api/pepes/get-pepe-list.api";
import { PepeList } from "../components/pepeList/pepeList";
import "./index.css"

export function Home() {
  const [pepeList, setPepeList] = useState();

  async function getPepes() {
    const foundPepes = await getPepeList();
    setPepeList(foundPepes);
    console.log(foundPepes)
  }

  useEffect(() => {
    getPepes();

  }, []);

  return (
    <div className="pepes-screen">
      <div className="home-title">HttPepe</div>
      <PepeList pepes={pepeList}></PepeList>
    </div>
  );
}
