public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project("Project 1", "Description 1");
        Project project2 = new Project("Project 2");
        Project project3 = new Project();

        Portfolio portfolio = new Portfolio();
        portfolio.setProjects(project1);
        portfolio.setProjects(project2);

        project2.setDescription("Some description for project 2");

        project3.setName("Project 3");
        project3.setDescription("Description for Proj 3!");

        project1.setInitialCost(123456);
        

        // System.out.println(project1.getName());
        // System.out.println(project2.getDescription());
        // System.out.println(project3.getName() + ": " + project3.getDescription());

        // System.out.println(project1.elevatorPitch());
        // System.out.println(project2.elevatorPitch());
        // System.out.println(project3.elevatorPitch());

        System.out.print(portfolio.getProjects());

    }
}