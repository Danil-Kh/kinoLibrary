import axios, {get} from "axios";

const API_URL = "http://localhost:8080";

export const getFilmInfo = async () => {
    const response = await axios.get(`${API_URL}/api/v1/urls/test`);
    return response.data
}