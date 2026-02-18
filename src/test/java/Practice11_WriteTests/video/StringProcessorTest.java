package Practice11_WriteTests.video;

import mentoring.Practice11_WriteTests.VideoCodeStringProcessor;
import org.junit.jupiter.api.BeforeEach;

public class StringProcessorTest {

    protected VideoCodeStringProcessor videoCodeStringProcessor;

    @BeforeEach
    public void setupTest() {
        videoCodeStringProcessor = new VideoCodeStringProcessor();
    }
}
