import Card from './micro.jsx';

export default function Contain(){
    let style={
        display:'flex',
         justifyContent:'center',
         alignItems:'center',
         flexWrap:'wrap'


};
    return (
        <div style={style}>
            <Card title="Branded Shoes Loot Lo" index={0}/>
            <Card title="THre HTEu HTEH" index={1}/>
            <Card title="MIcrosoft and t wagreaa" index={2}/>
            <Card title="Google and runrun" index={3}/>
        </div>
    )
}