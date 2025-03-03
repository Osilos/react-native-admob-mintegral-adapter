import { Text, View, StyleSheet, Pressable } from 'react-native';
import AdmobMintegralAdapter from 'react-native-admob-mintegral-adapter';

export default function App() {
  const setConsentIronSource = () => {
    AdmobMintegralAdapter.setConsent(true);
  };
  return (
    <View style={styles.container}>
      <Pressable onPress={setConsentIronSource}>
        <Text>Press to send consent.</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
