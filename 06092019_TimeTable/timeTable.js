var gcellId;
var gtrainerId;
var classes =[];
var trainers = [];
const school = ()=>{
    const trainer0 = {
        id : 0,
        name : "Trainer0",
        sub : "Maths"
    };
    const trainer1 = {
        id : 1,
        name : "Trainer1",
        sub : "science"
    };
    const trainer2 = {
        id : 2,
        name : "Trainer2",
        sub : "english"
    };
    const trainer3 = {
        id : 3,
        name : "Trainer3",
        sub : "computer"
    };
    const trainer4 = {
        id : 4,
        name : "Trainer4",
        sub : "backup"
    };
    localStorage.clear();
            trainers.push(trainer0);
            trainers.push(trainer1);
            trainers.push(trainer2);
            trainers.push(trainer3);
            trainers.push(trainer4);
            
            localStorage.setItem('trainers',JSON.stringify(trainers));

}
school();
function whichClass(className){
    renderTable(trainers);    
}
const renderTable = (trainers)=>{
    const rows = renderRows(trainers);
    document.getElementById('table').innerHTML=`<table class="table table-striped" style="width:100%" id="timeTable" >
                                                    <tr>
                                                        <th id="slot">Time Slot</th>
                                                        <th id="mon">Monday</th>
                                                        <th id="tue">Tuesday</th>
                                                        <th id="wed">Wednesday</th>
                                                        <th id="thu">Thursday</th>
                                                        <th id="fri">Friday</th>
                                                    </tr>
                                                    ${rows}                                                    
                                                </table>`;
fnSelectTrainer();    
}
function renderRows(trainers){
    let rows = '';
    let trid=0;
    trainers.forEach(t=>{
        rows += `<tr id="${trid}0">
                <td id "${(trid+1)*10}">${(trid+10)}</td>
                  <td id="${trid}0${t.id}" onclick="edit(this.id);">${t.name} ${t.sub}</td>
                  <td id="${trid}1${t.id}" onclick="edit(this.id);">${t.name} ${t.sub}</td>
                  <td id="${trid}2${t.id}" onclick="edit(this.id);">${t.name} ${t.sub}</td>
                  <td id="${trid}3${t.id}" onclick="edit(this.id);">${t.name} ${t.sub}</td>
                  <td id="${trid}4${t.id}" onclick="edit(this.id);">${t.name} ${t.sub}</td>
                </tr>`;
                trid++;
    });
    return rows;
}
function fnSelectTrainer(){    
    document.getElementById('trainers').innerHTML=" ";
    temp=JSON.parse(localStorage.getItem('trainers'));
    temp.forEach(t=>{
            document.getElementById('trainers').innerHTML+= `<option value='${t.id}'>${t.name} ${t.sub}</option>`;                   
        
    });
}
function edit(cellId){
    //let val=document.getElementById(localid).value;
     document.getElementById('notification').innerText="Selected cell is "+cellId;
     selectTag=document.getElementById('trainers'); 
     console.log(cellId);
     gcellId=cellId;
     
    // document.getElementById('updateForm').innerHTML="<form> <input type='text' id='updateTrainer'/><br /> <input type='submit' onclick='updateFn(document.getElementById('updateTrainer').value,id);' value='submit'/></form>";
    
}

function Update(){
    gtrainerId=selectTag.options[selectTag.selectedIndex].value;
     console.log(gtrainerId);    
      trainers.forEach(t=>{
            if(t.id==gtrainerId){
                document.getElementById(gcellId).innerText=t.name+" "+t.sub;
            }
    });
        
}

