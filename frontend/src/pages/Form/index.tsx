import FormCard from "components/FormCards";
import { useParams } from "react-router-dom";


type Props = {
    movieId : number;
}

function Form() {

    const params = useParams();

    return (
       <FormCard movieId= { `${params.movieId}`}   />
    )
}

export default Form;