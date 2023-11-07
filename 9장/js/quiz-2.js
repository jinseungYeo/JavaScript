function cat(name,from,color){
    this.name = name
    this.from = from
    this.color = color
}
cat.prototype.Cat=function(){
    document.write(`이름:${name}, 품종:${from},색깔 :${color}`);
}