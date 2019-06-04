/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterSceneAudioResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterSceneAudioResponse.AudioLayer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterSceneAudioResponseUnmarshaller {

	public static DescribeCasterSceneAudioResponse unmarshall(DescribeCasterSceneAudioResponse describeCasterSceneAudioResponse, UnmarshallerContext context) {
		
		describeCasterSceneAudioResponse.setRequestId(context.stringValue("DescribeCasterSceneAudioResponse.RequestId"));
		describeCasterSceneAudioResponse.setCasterId(context.stringValue("DescribeCasterSceneAudioResponse.CasterId"));
		describeCasterSceneAudioResponse.setFollowEnable(context.integerValue("DescribeCasterSceneAudioResponse.FollowEnable"));

		List<String> mixList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCasterSceneAudioResponse.MixList.Length"); i++) {
			mixList.add(context.stringValue("DescribeCasterSceneAudioResponse.MixList["+ i +"]"));
		}
		describeCasterSceneAudioResponse.setMixList(mixList);

		List<AudioLayer> audioLayers = new ArrayList<AudioLayer>();
		for (int i = 0; i < context.lengthValue("DescribeCasterSceneAudioResponse.AudioLayers.Length"); i++) {
			AudioLayer audioLayer = new AudioLayer();
			audioLayer.setVolumeRate(context.floatValue("DescribeCasterSceneAudioResponse.AudioLayers["+ i +"].VolumeRate"));
			audioLayer.setValidChannel(context.stringValue("DescribeCasterSceneAudioResponse.AudioLayers["+ i +"].ValidChannel"));
			audioLayer.setFixedDelayDuration(context.integerValue("DescribeCasterSceneAudioResponse.AudioLayers["+ i +"].FixedDelayDuration"));

			audioLayers.add(audioLayer);
		}
		describeCasterSceneAudioResponse.setAudioLayers(audioLayers);
	 
	 	return describeCasterSceneAudioResponse;
	}
}