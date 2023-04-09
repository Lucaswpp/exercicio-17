import java.util.Scanner;
import java.text.MessageFormat;
import java.text.DecimalFormat;
public class Solucao17
{

    static int calc_latas_tintas(double area,double tinta)
    {
        double calc = 0;
        int quantidade_tinta = 0;

        calc = (area/6)/tinta;

        System.out.println(calc);

        quantidade_tinta = (int) calc;
        
        if ((area/6) % tinta != 0)
        {
            quantidade_tinta = (int) quantidade_tinta + 1;
        }

        return quantidade_tinta;
    }

    public static void main(String[] args)
    {
        System.out.print("Tamanho da área: ");
        double area = new Scanner(System.in).nextDouble();
        DecimalFormat dt = new DecimalFormat("#.##");

        int tot_tinta_18 = calc_latas_tintas(area,18);
        int tot_tinta_36 = calc_latas_tintas(area,3.6);

        double folga = area * 10/100;

        double calc_tintas_18 = ((((folga+area)/6)/18));

        double calc_tintas_36 = (((folga+area)/6)%18)/3.6;

        double tot_tintas = calc_tintas_18 + calc_tintas_36;

        if (((folga+area/6)%18)/3.6 != 0)
        {
            calc_tintas_36 += 1;
        }

        String res1 = MessageFormat.format("Você comprou {0} tintas de 18L e gastou {1}R$",tot_tinta_18,tot_tinta_18 * 80.00);
        String res2 = MessageFormat.format("Você comprou {0} tintas de 3,6L e gastou {1}R$",tot_tinta_36,tot_tinta_36 * 25.00);
        String res3 = MessageFormat.format("Você comprou {0} tintas e gastou {1}R$",(int) (calc_tintas_18 + calc_tintas_36),dt.format(calc_tintas_18 * 80.00),calc_tintas_36 * 25.00);
        

       System.out.println(res1);
       System.out.println(res2);
       System.out.println(res3);
    }
}