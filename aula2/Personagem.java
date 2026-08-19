public class Personagem {


    int nivel;
    int vida;
    int forca;
    String nome;
    int cura;   

    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
    }

    void atacar(Personagem alvo) {
        alvo.vida = alvo.vida - forca;
        System.out.println("Vida: " + alvo.vida);
    }
    
    void curar(Personagem alvo) {
        alvo.vida = alvo.vida + cura;
        System.out.println("Vida: " + alvo.vida);
    }

    void verificarVida(Personagem p1, Personagem p2, Personagem p3) {     
    if (vida <= 0);
    System.out.println("Guerreiro morto!");
    }
}

