// Classe é o Tipo do Projeto O que vou criar?

public class CalcTeste {

    //Atributos são características (Propriedades e Campos)
    // int, double, String são declarações, tipos de espaços que serão armazenados.
    int n1;
    int n2;
    int n3;
    int n4;

//Criei métodos das operações de matemática que o faz em cima do valor de cada atributo
    //Ele considera o valor colocado no atributo e opera em cima de outro valor acrescentado
public void sub(int valor){
    n1 = n1 - valor;

}
    public void soma(int valor){
        n2 = n2 + valor;
    }
    public void mult(int valor){
        n3 = n3 * valor;
    }
    public void div(int valor){
        n4 = n4 / valor;
    }
    //main inicia a aplicação
    public static void main(String[] args) {

        //Criação da variável, da instância e o nome da instância.
       CalcTeste calcula = new CalcTeste();


       //A variável subtracao .(estancia) ao atributo n1 = informação que eu quero.
        calcula.n1 = 100;
        System.out.println(calcula.n1);

        //Invoquei o metodo que subtrai o valor do n1 com valor acrescentado.
        calcula.sub(30);
        System.out.println("O resultado da subtracao e " + calcula.n1);

        calcula.n2 = 200;
        System.out.println(calcula.n2);

        //Invoquei o metodo que soma o valor do n2 com valor acrescentado.
        calcula.soma(30);
        System.out.println("O resultado da soma e " + calcula.n2);

        calcula.n3 = 200;
        System.out.println(calcula.n3);

        calcula.mult(2);
        System.out.println("O resultado da multriplicacao e " + calcula.n3);

        calcula.n4 = 200;
        System.out.println(calcula.n4);

        calcula.div(2);
        System.out.println("O resultado da divisao e " + calcula.n4);
            }
        }



