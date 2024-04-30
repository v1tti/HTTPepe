import { createBrowserRouter } from "react-router-dom";
import { Home } from "../ui";

export const router = createBrowserRouter([
    {
        path: "/",
        element: <Home></Home>
    }
])