public class Main {
    public static void main(String[] args) {

        Personagem guerreiro = new Personagem();
        
        guerreiro.nome = "Pitty";
        guerreiro.vida = 100;
        guerreiro.forca = 25;
        guerreiro.nivel = 2;
        guerreiro.cura = 0;

        Personagem monstro = new Personagem();

        monstro.nome = "Gaby Amarantos";
        monstro.vida = 60;
        monstro.forca = 20;
        monstro.nivel = 1; 
        monstro.cura = 0;

        Personagem bardo = new Personagem();

        bardo.nome = "Nando Reis";
        bardo.vida = 70;
        bardo.forca = 0;
        bardo.nivel = 2;
        bardo.cura = 10;

        Personagem paladino = new Personagem();

        paladino.nome = "Karina Buhr";
        paladino.vida = 80;
        paladino.forca = 20;
        paladino.nivel = 2;
        paladino.cura = 0;

        guerreiro.exibirStatus();

        monstro.exibirStatus();

        paladino.exibirStatus();
    
        guerreiro.atacar(monstro);

        monstro.atacar(guerreiro);

        guerreiro.atacar(monstro);

        monstro.atacar(guerreiro);

        bardo.curar(guerreiro);

        guerreiro.verificarVida(guerreiro, monstro, paladino);


    }

}