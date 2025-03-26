public class Codigo {
    private int codigo;
    private char letra;

    /**
     * es el constructor que inicializa un código con un número y una letra
     *
     * @param codigo el número del código
     * @param letra la letra del código
     */
    public Codigo(int codigo, char letra) {
        this.codigo = codigo;
        this.letra = letra;
    }

    /**
     * el método para obtener el número del código
     *
     * @return el número del código
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * es el método para establecer un nuevo número en el código
     *
     * @param codigo el nuevo número del código
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * es el método para obtener la letra del código
     *
     * @return la letra del código
     */
    public char getLetra() {
        return letra;
    }

    /**
     * es el método para establecer una nueva letra en el código
     *
     * @param letra la nueva letra del código
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

     /**
     * es la rpresentación en cadena del código
     *
     * @return el código en formato "número-letra"
     */
    @Override
    public String toString() {
        return codigo + "-" + letra;
    }
}