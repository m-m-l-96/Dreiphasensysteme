function func() {
   // Kordinaten der Punkten

   let ru = [];
   let su = [];
   let tu = [];
   let d = [];
   let b = [];

   // gegeben bzw. gemessen 

   let ul, u1,u2,u3, mu;
   let _mu = document.getElementById('mu');
   mu = _mu.value;
   let _ul = document.getElementById('ul');
   ul = _ul.value;
   let _u1 = document.getElementById('u1');
   u1 = _u1.value;
   let _u2 = document.getElementById('u2');
   u2 = _u2.value;
   let _u3 = document.getElementById('u3');
   u3 = _u3.value;

   

   let ll = ul/mu;
   let ls = ll/ Math.sqrt(3);
   let ls__ = ls * Math.cos(Math.PI/6);
   let __ll = ll * Math.sin(Math.PI/3);
   let __ls = ls * Math.sin(Math.PI/6);
   let l1 = ls - (u1/mu);
   let l2 = (-ls+ (u2/mu)) * Math.cos(Math.PI/6);
   let l3 = (ls- (u3/mu)) * Math.cos(Math.PI/6);
   let x__ = l2 + l3;
   let x = x__ + ls__;
   let y = l1 + __ls;

   ru.push(0);
   ru.push(0);
   tu.push(ll);
   tu.push(0);
   su.push(ls__);
   su.push(__ll);
   d.push(ls__);
   d.push(__ls);
   b.push(x);
   b.push(y);
   var trace1 = {

      x: [ru[0], tu[0], su[0], d[0], b[0]],
    
      y: [ru[1], tu[1], su[1], d[1], b[1]],
      text: ['Knoten R<br>', 'Knoten T<br>', 'Knoten S<br>', 'Knoten D<br>', 'Knoten B<br>'],
    
      mode: 'markers',
    
      marker: {
    
        size: [30, 30, 30, 50, 50],
        color:['rgb(50, 135, 231)', 'rgb(50, 135, 231)', 'rgb(50, 135, 231)','rgb(16, 172, 86)', 'rgb(209, 38, 8)' ],
        
    
      }
    
   };
 
   var data = [trace1];
  
   var layout = {
    
      title: 'Zeigerdiagramm',
    
      showlegend: false,
    
      height: 500,
    
      width: 900
    
   };
   var config = {

      showEditInChartStudio: false,
      displayModeBar: false,
    
      plotlyServerURL: "https://chart-studio.plotly.com"
    
    };

   Plotly.newPlot('myDiv', data, layout, config);
   let element = document.getElementById('mydivDesc');
   element.innerText='Cursor über die Punkte bewegen, um Knotenname und die genauen Koordinaten anzuzeigen';

   _mu.value='';
   _ul.value='';
   _u1.value='';
   _u2.value='';
   _u3.value='';
}
function ret(){
   let element = document.getElementById('myDiv');
   let _element = document.getElementById('myDiv-desc');
   let __element = document.getElementById('mydivDesc');
   __element.innerText='';
   element.innerHTML ='';
   element.innerT='';
   _element.innerHTML ='';
   _element.innerT='';
}