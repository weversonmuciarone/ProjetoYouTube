
package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
            v[0] = new Video("Aula 01 de POO");
            v[1] = new Video("Aula 02 de POO");
            v[2] = new Video("Aula 03 de POO");

        Gafanhoto[] g = new Gafanhoto[2];
            g[0] = new Gafanhoto("Weverson", "M",37,"Muciarone");
            g[1] = new Gafanhoto("Luana","F",29,"lumuciarone");

        Visualizacao[] vis = new Visualizacao[5];
            vis[0] = new Visualizacao(g[0],v[0]);
            vis[0].avaliar(85.0f);
            System.out.println(vis[0].toString());
              
                


                /*System.out.println("----------VIDEOS----------");
                System.out.println(v[0].toString());
                System.out.println(v[1].toString());
                System.out.println(v[2].toString());
                System.out.println("--------GAFANHOTO--------");
                System.out.println(g[0].toString());
                System.out.println(g[1].toString());*/


        
        
    }
    
}
