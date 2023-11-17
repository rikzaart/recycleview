// MainActivity.java
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Article> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dummy data
        articles = new ArrayList<>();
        articles.add(new Article("Title 1", "Overview 1", R.drawable.image1));
        // Add more articles

        ArticleAdapter adapter = new ArticleAdapter(this, articles);
        recyclerView.setAdapter(adapter);
    }
}
