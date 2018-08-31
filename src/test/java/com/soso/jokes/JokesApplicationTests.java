package com.soso.jokes;

import com.soso.jokes.hot.service.HotService;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JokesApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private HotService hotService;

	@Test
	public void testPagehot() {
		Long totalCount = hotService.totalCount();
		System.out.println(totalCount);
	}

	@Test
	public void testText() {
		File file = new File("catalina.out");
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = bufferedReader.readLine();
			long index = 0;
			BufferedWriter bufferedWriter = null;
			while (StringUtils.isNotBlank(line)) {
				if (index % 5000 == 0){
					String fileName = "catalina.out-" + index;
					bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
				}
				bufferedWriter.write(line + "\n");
				line = bufferedReader.readLine();
				index++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
