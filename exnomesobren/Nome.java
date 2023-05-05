package br.com.exnomesobren;
import java.io.*;

       public class Nome {

        public static void main(String[] args) throws IOException
        {

            PrintWriter pw = new PrintWriter("C:/Users/dayan/OneDrive/Área de Trabalho/exemploderafaela/NOMECOMPLETO.txt");
            BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/dayan/OneDrive/Área de Trabalho/exemploderafaela/NOME.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/dayan/OneDrive/Área de Trabalho/exemploderafaela/SOBRENOME.txt"));


            String line1 = br1.readLine();
            String line2 = br2.readLine();


            while (line1 != null || line2 !=null)
            {
                if(line1 != null)
                {
                    pw.print(line1 + " ");
                    line1 = br1.readLine();
                }

                if(line2 != null)
                {
                    pw.println(line2);
                    line2 = br2.readLine();
                }
            }

            pw.flush();

            // closing resources
            br1.close();
            br2.close();
            pw.close();

            System.out.println("ahhh  a onde noois chegou,valeu a pena esperarrrrrrrrrrrrrr");
        }
    }





