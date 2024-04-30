import { axiosInstance } from "../_base/axios-instance.api";

export async function getPepeList() {
    const response = await axiosInstance.get("/pepes")

    return response.data
}