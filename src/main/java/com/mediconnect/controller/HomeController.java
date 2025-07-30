@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // maps to index.html
    }

    @GetMapping("/doctors")
    public String viewDoctors(Model model) {
        List<Doctor> doctors = List.of(
            new Doctor("Dr. Siva", "Cardiologist", "Hyderabad"),
            new Doctor("Dr. Meera", "Dermatologist", "Chennai")
        );
        model.addAttribute("doctors", doctors);
        return "docker_list"; // maps to docker_list.html
    }
}
