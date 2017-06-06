# Task-Management-Completed
In this fully task management project, I built with spring boot with Maven <version>1.4.3.RELEASE</version>.
And I used MySQL Database as my DB.
* Feature:
- Custom Login with Spring Web Security
- Custom error page
- Custom logger using Log4j2
- CRUD with CrudRepository: "import org.springframework.data.repository.CrudRepository"
- Custom Spring Boot banner logo
- Auto generate table in Database 
<pre>

@Entity
@Table(name = "task")
public class Task{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	private boolean finished;
}
</pre>
