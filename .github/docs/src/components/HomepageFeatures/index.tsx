import clsx from 'clsx';
import Heading from '@theme/Heading';
import styles from './styles.module.css';

type FeatureItem = {
  title: string;
  Svg: React.ComponentType<React.ComponentProps<'svg'>>;
  description: JSX.Element;
};

const FeatureList: FeatureItem[] = [
  {
    title: 'Manage the session and device',
    Svg: require('@site/static/img/undraw_push_notifications.svg').default,
    description: (
      <>
        Using driver scripts, manage the test session and device.
      </>
    ),
  },
  {
    title: 'Android and iOS',
    Svg: require('@site/static/img/undraw_notifications.svg').default,
    description: (
      <>
        Use XCUITest and UiAutomator2 scripts, taking advantage of the performance 
        and functionality of native Android and iOS drivers.
      </>
    ),
  },
  {
    title: 'Automate complex actions',
    Svg: require('@site/static/img/undraw_swipe.svg').default,
    description: (
      <>
        Perform complex actions such as scroll, swipe, pinch 
        and many others in your automated tests.
      </>
    ),
  }
];

function Feature({title, Svg, description}: FeatureItem) {
  return (
    <div className={clsx('col col--4')}>
      <div className="text--center">
        <Svg className={styles.featureSvg} role="img" />
      </div>
      <div className="text--center padding-horiz--md">
        <Heading as="h3">{title}</Heading>
        <p>{description}</p>
      </div>
    </div>
  );
}

export default function HomepageFeatures(): JSX.Element {
  return (
    <section className={styles.features}>
      <div className="container">
        <div className="row">
          {FeatureList.map((props, idx) => (
            <Feature key={idx} {...props} />
          ))}
        </div>
      </div>
    </section>
  );
}
