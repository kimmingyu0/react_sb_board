import Header from "../components/common/Header";
import HeroImg2 from "../components/HeroImg2";
import Footer from "../components/common/Footer";
import {useTitle} from "../util/UpdateTitle";
import Detail from "../components/list/Detail";

const BoardDetail = (props) => {
    useTitle('Board Detail');

    return (
        <div>
            <Header />
            <HeroImg2 heading="게시글 조회" text="Detail Page"/>
            <Detail userInfo={props.userInfo}/>
            <Footer />
        </div>
    );
};

export default BoardDetail;