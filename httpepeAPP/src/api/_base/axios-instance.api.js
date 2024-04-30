import axios from "axios";
import { BASE_API_URL } from "../constants/base-url.constant";

export const axiosInstance = axios.create({
  baseURL: BASE_API_URL,
  timeout: 10000,
});
