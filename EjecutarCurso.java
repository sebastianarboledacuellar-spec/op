public class EjecutarCurso {
	public static void main(String[] args) {
		Curso c1 = new Curso(1, "Matemáticas", "Ana Pérez", 30);
		Curso c2 = new Curso(2, "ing de sistemas", "Jhon cano", 25);
		Curso c3 = new Curso(3, "Física", "María Ruiz", 28);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Calcular total de estudiantes entre los cursos creados
        Curso[] cursos = {c1, c2, c3};
        int totalEstudiantes = 0;
        for (Curso c : cursos) {
            totalEstudiantes += c.getCantidadEstudiantes();
        }
        System.out.println("Total de estudiantes en todos los cursos: " + totalEstudiantes);

        
    }
}
