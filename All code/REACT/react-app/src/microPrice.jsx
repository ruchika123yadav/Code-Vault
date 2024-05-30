export default function Price({index}){
    let old_price=[100,2000,300,400];
    let new_price=[50,100,200,40];
     let oldStyle={
        textDecorationLine:'line-through',
        
     }
     let newStyle={
        fontWeight:'bold'
     }
     let styles={backgroundColor:'red'
     ,height:'20px',
     borderBottomLeftRadius:'15px',
     borderBottomRightRadius:'15px',
      
     }
    return (
        <div style={styles}>
            <span style={oldStyle} >{old_price[index]}</span>
            &nbsp;&nbsp;&nbsp;
            <span style={newStyle}>{ new_price[index]}</span>
        </div>
    )
}