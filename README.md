
# react-native-gpay-button

## Getting started

`$ npm install react-native-gpay-button --save`

### Mostly automatic installation

`$ react-native link react-native-gpay-button`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNGooglePayButtonPackage;` to the imports at the top of the file
  - Add `new RNGooglePayButtonPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-gpay-button'
  	project(':react-native-gpay-button').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-gpay-button/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-gpay-button')
  	```


## Usage
```javascript
import RNGooglePayButton from 'react-native-gpay-button';

...

render() {
  return <RNGooglePayButton />
}
```
