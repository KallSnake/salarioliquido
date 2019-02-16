
import javax.swing.JOptionPane;

public class SalarioLiquido {
    
    
    float salarioBruto;
    float planoSaude;
    float dependentes;
    
    
    public void calcularSalLiquido(float salarioBruto, float planoSaude, float dependentes){
        
        
        // INSS 
        float inss = 0;
        
        
        if ( salarioBruto <= 1751.81 ) {
            
            inss = ((salarioBruto * 8) / 100 );
            
        } else if ( (salarioBruto >= 1751.82) && (salarioBruto <= 2919.72) ) {
            
            inss = ((salarioBruto * 9) / 100 );
            
        } else if ( (salarioBruto >= 2919.73) && (salarioBruto <= 5839.45) ) {
            
            inss = ((salarioBruto * 11) / 100 );
        }
        
        
        // salario 1500 
        // inss 120
        // salario - inss 1380
        
        
        
        // Imposto de renda
        float impostoReda = (salarioBruto - inss);
        float impostoRetido = 0;
        
        
        if ( (impostoReda >= 1499.16) && (impostoReda <= 2246.75) ) {
            
            impostoRetido = (float) ((float) ((impostoReda * 7.5) / 100) - 112.43);
            
        } else if ( (impostoReda >= 2246.76) && (impostoReda <= 2995.70) ) {
            
            impostoRetido = (float) ((float) ((impostoReda * 15 / 100)) - 280.94);
            
        } else if ( (impostoReda >= 2995.71) && (impostoReda <= 3743.19) ) {
            
            impostoRetido = (float) ((float) ((impostoReda * 22.5) / 100) - 505.62);
            
        } else if ( (impostoReda > 3743.19) ) {
            
            impostoRetido = (float) ((float) ((impostoReda * 27.5) / 100) - 692.78);
            
        }
        
        
        
        // impostoReda 1380
        // 1380 * 7.5 / 100 = 103.50
        
        
        if ( dependentes == 0 ) {
            
            planoSaude = planoSaude;
            
        } else {
            
           planoSaude += (float) (150.59 * dependentes);
           
        }
        
        
        
        float salarioLiquido = ((((salarioBruto - inss) - impostoRetido) - planoSaude) );
        
        
        JOptionPane.showMessageDialog(null,"Salário Liquido: " + salarioLiquido);
        
        
        
    }
    
    
}
