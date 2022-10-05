import org.w3c.dom.ls.LSOutput;

public class Pessoa {

        //atriburo
        private float peso ;
        private float altura ;

        //método construtor
        public Pessoa(float peso, float altura){
            this.peso = peso;
            this.altura = altura;
        }

        //método
        public float calcularIMC(){
            float imc = peso / (altura * altura);
            return imc;
        }
        //método para acesso dos dados
        public void setPeso(float peso){
            this.peso = peso;
        }
        public float getPeso(){
            return peso;
        }
        public void setAltura(float altura){
            this.altura = altura;
        }
        public float getAltura(){
            return altura;
        }
    }


