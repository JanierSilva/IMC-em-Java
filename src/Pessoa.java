public class Pessoa {

        //atriburo
        float peso ;
        float altura ;

        //método
        public float calcularIMC(){
            float imc = peso / (altura * altura);
            return imc;
        }
    }


